
package apisample;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "codCia",
    "empresa",
    "usuario",
    "referencia",
    "nroTarjeta",
    "valid",
    "origen"
})
public class ApiSample {

    @JsonProperty("codCia")
    private String codCia;
    @JsonProperty("empresa")
    private String empresa;
    @JsonProperty("usuario")
    private String usuario;
    @JsonProperty("referencia")
    private String referencia;
    @JsonProperty("nroTarjeta")
    private String nroTarjeta;
    @JsonProperty("valid")
    private String valid;
    @JsonProperty("origen")
    private String origen;

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
     *     The empresa
     */
    @JsonProperty("empresa")
    public String getEmpresa() {
        return empresa;
    }

    /**
     * 
     * @param empresa
     *     The empresa
     */
    @JsonProperty("empresa")
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * 
     * @return
     *     The usuario
     */
    @JsonProperty("usuario")
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     * @param usuario
     *     The usuario
     */
    @JsonProperty("usuario")
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * 
     * @return
     *     The referencia
     */
    @JsonProperty("referencia")
    public String getReferencia() {
        return referencia;
    }

    /**
     * 
     * @param referencia
     *     The referencia
     */
    @JsonProperty("referencia")
    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    /**
     * 
     * @return
     *     The valid
     */
    @JsonProperty("valid")
    public String getValid() {
        return valid;
    }

    /**
     * 
     * @param valid
     *     The valid
     */
    @JsonProperty("valid")
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * 
     * @return
     *     The origen
     */
    @JsonProperty("origen")
    public String getOrigen() {
        return origen;
    }

    /**
     * 
     * @param origen
     *     The origen
     */
    @JsonProperty("origen")
    public void setOrigen(String origen) {
        this.origen = origen;
    }

}
