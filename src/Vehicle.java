import java.time.LocalDateTime;

public class Vehicle{

    private String numberPlate;
    private String typology;
    private LocalDateTime start;
    private LocalDateTime end;

    public Vehicle(String numberPlate, String typology, LocalDateTime start, LocalDateTime end) {
        this.numberPlate = numberPlate;
        this.typology = typology;
        this.start = start;
        this.end = end;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getTypology() {
        return typology;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "numberPlate='" + numberPlate + '-' +
                ", typology='" + typology + '-' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}