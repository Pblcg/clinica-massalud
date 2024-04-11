import java.time.LocalTime;
import java.time.LocalDate;

class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
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
