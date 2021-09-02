
package proyecto;


public class Paciente {
    String cedula,nombres,apellido,direccion,correo,doctor,diagnostico,medicacion,TipoConsulta,telefono;
    int edad;
    double PagoTotal;
    String fecha;

    public Paciente(String cedula, String nombres, String apellido, int edad,String direccion, String correo,String telefono, String doctor, String diagnostico, String medicacion, double PagoTotal ,String TipoConsulta,String fecha ) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.doctor = doctor;
        this.diagnostico = diagnostico;
        this.medicacion = medicacion;
        this.PagoTotal = PagoTotal;
        this.edad = edad;
        this.telefono = telefono;
        this.TipoConsulta =TipoConsulta;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoConsulta() {
        return TipoConsulta;
    }

    public void setTipoConsulta(String TipoConsulta) {
        this.TipoConsulta = TipoConsulta;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public double getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(double PagoTotal) {
        this.PagoTotal = PagoTotal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
