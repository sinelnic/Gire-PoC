
package comprobarpan;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "codCia",
    "nroTarjeta"
})
public class ComprobarPan {

    @JsonProperty("codCia")
    private String codCia;
    @JsonProperty("nroTarjeta")
    private String nroTarjeta;

    /**
     * 
     * @return
     *     The codCia
     */
    @JsonProperty("codCia")
    public String getCodCia() {
        return codCia;
    }

    /**
     * 
     * @param codCia
     *     The codCia
     */
    @JsonProperty("codCia")
    public void setCodCia(String codCia) {
        this.codCia = codCia;
    }

    /**
     * 
     * @return
     *     The nroTarjeta
     */
    @JsonProperty("nroTarjeta")
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * 
     * @param nroTarjeta
     *     The nroTarjeta
     */
    @JsonProperty("nroTarjeta")
    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

}
