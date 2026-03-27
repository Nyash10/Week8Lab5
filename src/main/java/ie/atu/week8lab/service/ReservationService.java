package ie.atu.week8lab.service;
import ie.atu.week8lab.model.Reservation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;


@Service
public class ReservationService {

    public Reservation addReservation (@Valid Reservation reservation)
    {
        return new Reservation();
    }
}
