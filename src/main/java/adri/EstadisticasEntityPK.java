package adri;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EstadisticasEntityPK implements Serializable {
    private String temporada;
    private int jugador;

    @Column(name = "temporada", nullable = false, length = 5)
    @Id
    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Column(name = "jugador", nullable = false)
    @Id
    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadisticasEntityPK that = (EstadisticasEntityPK) o;
        return jugador == that.jugador &&
                Objects.equals(temporada, that.temporada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temporada, jugador);
    }
}
