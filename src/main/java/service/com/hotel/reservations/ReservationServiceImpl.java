package service.com.hotel.reservations;

import com.hotel.reservations.RequestDocument;
import com.hotel.reservations.ReservationServiceSkeleton;
import com.hotel.reservations.ResponseDocument;
import com.hotel.reservations.ResponseDocument.Response;

public class ReservationServiceImpl extends ReservationServiceSkeleton
{
    /**
     * Propiedad inyectada por Spring para el acceso a datos
     * con el metodo setReservacionesDao(...);
     */
    private ReservacionesDao reservacionesDao;
    public void setReservacionesDao(ReservacionesDao reservacionesDao)
    {
        this.reservacionesDao = reservacionesDao;
    }

    @Override
    public ResponseDocument reservationOperation(RequestDocument request)
    {
        ResponseDocument document = ResponseDocument.Factory.newInstance();
        Response response = document.addNewResponse(); //Respuesta vacia
        response.setReservado(false); //Respuesta de reservacion por defecto es false

        try
        {
            reservacionesDao.add(request.getRequest());
            response.setReservado(true); //Si no hay error al insertar, se confirma la reservacion
        }catch (Exception e)
        {
            System.out.println("No se pudo hacer la reservacion :c");
            e.printStackTrace();
        }
        return document;
    }
}
