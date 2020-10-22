package data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String dni;

    @Column
    private String nombre;

    @Column
    private String primerNombre;

    @Column
    private String segundoNombre;

    @Column
    private String apellidoPaterno;

    @Column
    private String apellidoMaterno;

    @Column
    private String email;

    @Column
    private Integer vigencia;

    @Column
    private Integer sexo;

    @Column
    private String password;

    @Column
    private Date fechaCese;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String email, Integer vigencia, Integer sexo, String password, Date fechaCese) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
        this.vigencia = vigencia;
        this.sexo = sexo;
        this.password = password;
        this.fechaCese = fechaCese;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getNombreCompleto() {
        StringBuilder nombreCompleto = new StringBuilder();
        nombreCompleto.append(primerNombre).append(" ").append(segundoNombre).append(" ").append(apellidoPaterno)
                .append("").append(apellidoMaterno);
        return nombreCompleto.toString();
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(Date fechaCese) {
        this.fechaCese = fechaCese;
    }

}
