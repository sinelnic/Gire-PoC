
package pgpsample;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "nroTarjeta"
})
public class PgpSample {

    @JsonProperty("nroTarjeta")
    private String nroTarjeta;

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
