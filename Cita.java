import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        DateTimeFormatter esDateFormatLargo = DateTimeFormatter
                .ofPattern("dd/MM/yyyy")
                .withLocale(new Locale("es", "ES"));
                
        return "" + fecha.format(esDateFormatLargo);
    }

    public String getHora() {
        return "" + hora;
    }
}
