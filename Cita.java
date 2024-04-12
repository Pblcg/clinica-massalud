import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("d/M/yyyy"));
        this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}
