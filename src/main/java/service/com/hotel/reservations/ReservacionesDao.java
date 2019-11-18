package service.com.hotel.reservations;

import com.hotel.reservations.RequestDocument.Request;
import org.springframework.jdbc.core.JdbcTemplate;

public class ReservacionesDao
{
    /**
     * JdbcTemplate para sentencias SQL
     * Propiedad inyectada por Spring con el metodo setJdbcTemplate(...);
     */
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void add(Request request)
    {
        String insert = "INSERT INTO Reservaciones VALUES (0, %s, '%s', '%s')";
        insert = String.format(insert, request.getCuarto(),
                request.getCheckin(), request.getCheckout());
        jdbcTemplate.execute(insert);
    }
}
