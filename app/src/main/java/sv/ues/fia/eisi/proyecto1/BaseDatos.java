package sv.ues.fia.eisi.proyecto1;

public class BaseDatos {
    public static final String TABLE_RANGO_EDAD = "RANGO_EDAD";

    public static final String[] camposCliente = new String[]{"idCliente","idRangoEdad","idUsuario","idSexo","nomcliente","telefonoCliente"};
    public static final String[] camposComentarios = new String[]{"idComentarios","idUsuario","idLocal","textComentario","fechaComentario"};
    public static final String[] camposDenuncias = new String[]{"idDenuncias","idUsuario","idLocal","textDenuncia","fechaDenuncia"};
    public static final String[] camposDepartamento = new String[]{"idDepartamento","nomDepartamento"};
    public static final String[] camposEmpresa = new String[]{"idEmpresa","idTipoEmpresa","nomLegalEmpresa","nitEmpresa","giroEmpresa","nrcEmpresa"};
    public static final String[] camposEvaluacion = new String[]{"idLocal","idCliente","idTipoSatisfaccion","notaEvaCliente"};
    public static final String[] camposLocal = new String[]{"idLocal","idEmpresa","idSector","idMunicipio","nombreLocal","descripLocal"};
    public static final String[] camposMunicipio = new String[]{"idMunicipio","idDepartamento","nomMunicipio"};
    public static final String[] camposRangoEdad = new String[]{"idRangoEdad","nomRangoEdad","edadMenor","edadMayor"};
    public static final String[] camposSector = new String[]{"idSector","tipoSector"};
    public static final String[] camposSexo = new String[]{"idSexo","nomSexo","abreviaturaSexo"};
    public static final String[] camposSugerencias = new String[]{"idSugerencia","idUsuario","idLocal","textSugerencia","fechaSugerencia"};
    public static final String[] camposSugerencias_App = new String[]{"idSugerenciasApp","idUsuario","txtSugerenciasApp"};
    public static final String[] camposSTipoEmpresa= new String[]{"idTipoEmpresa","nomTipoEmpresa"};
    public static final String[] camposTipoSatisfaccion = new String[]{"idTipoSatisfaccion","nomTipoSatisfaccion","notaMenor","notaMayor"};
    public static final String[] camposTipoUsuario = new String[]{"idTipoUsuario","desTipoUsuario"};
    public static final String[] camposUsuario = new String[]{"idUsuario","idTipoUsuario","idEmpresa","nomUsuario","contraUsuario","correoUsuario"};
}
