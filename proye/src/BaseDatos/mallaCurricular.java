package BaseDatos;
import clases.Curso;
import java.util.ArrayList;

public class mallaCurricular {
    public  static ArrayList<Curso> _mallaSistemas ;
    //constructor sin parametros
    
    public mallaCurricular() {
         //Creamos el array
        _mallaSistemas = new ArrayList<>();
        
        //curso Matematica Basica
        Curso matematicaBasica = new Curso ("MA-141","Matemática Básica","R",null,"impar","100",3);
        _mallaSistemas.add(matematicaBasica);//Agregamos el objeto al array.
        
        //Algoritmos 
        Curso algoritmos = new Curso ("IS-141","Algoritmos","R",null,"impar","100",4);
        _mallaSistemas.add(algoritmos);
        
        //curso Lenguaje 
        Curso comunicacionOralEscrita = new Curso ("LE-141","Comuninación oral y escrita","R",null,"impar","100",2);
        _mallaSistemas.add(comunicacionOralEscrita);
        
        //Curso calculo
        Curso caculoI = new Curso ("MA-143","Cálculo I","R",null,"impar","100",5);
        _mallaSistemas.add(caculoI);
        
        //curso computación básica
        Curso computacionBasica = new Curso ("CC-121","Computación Básica","Co",null,"impar","100",2);
        _mallaSistemas.add(computacionBasica);
        
        //curso Economía
        Curso economia = new Curso ("EC-141","Economía","R",null,"impar","100",3);
        _mallaSistemas.add(economia);
        
        //curso metodologia del estudio universitario
        Curso metodo = new Curso ("MD-141","Método del estudio Universitario","R",null,"impar","100",3);
        _mallaSistemas.add(metodo);
        
        //Curso Folclore 
        Curso folklore = new Curso ("Ac-121","folklore","Co",null,"impar","100",3);
        
        _mallaSistemas.add(folklore);

        //----------------*PAR*----------------------//
        
        Curso matematicaDiscreta = new Curso ("MA-144","Matemática Discreta","R",matematicaBasica,"par","100",3);
        _mallaSistemas.add(matematicaDiscreta);
        
        Curso poo = new Curso("IS-142", "Programación Orientada a Objetos", "R",algoritmos, "par", "100",4);
        _mallaSistemas.add(poo);
        
        Curso calII = new Curso("MA-144","Cálculo II", "R",caculoI, "par", "100", 4);
        _mallaSistemas.add(calII);
        
        Curso admi = new Curso("AD-142","Administración General", "R",null, "par", "100", 3);
        _mallaSistemas.add(admi);
        
        Curso fisicaI = new Curso("FS-142","Fisica I", "R",caculoI, "par", "100", 4);
        _mallaSistemas.add(fisicaI);
        
        Curso micro = new Curso("EC-142","Microeconomía", "R",economia, "par", "100", 3);
        _mallaSistemas.add(micro);
        
        Curso depormen = new Curso("EF-122","Deportes Menores", "Co",null, "par", "100", 4);
        _mallaSistemas.add(depormen);
        
        
        //--------------SERIE 200------------------------//
        //--------------------*IMPAR*--------------------//
        Curso algeLin = new Curso("MA-241","Algebra Lineal", "R",matematicaBasica, "impar", "200", 3);
        _mallaSistemas.add(algeLin);
        
        Curso estrucDatos = new Curso("IS-241","Estructura de Datos", "R",poo, "impar", "200", 4);
        _mallaSistemas.add(estrucDatos);
        
        Curso calIII = new Curso("MA-243","Cálculo III", "R",calII, "impar", "200", 4);
        _mallaSistemas.add(calIII);
        
        Curso estadiI = new Curso("ES-241","Estadística I", "R",calII, "impar", "200", 3);
        _mallaSistemas.add(estadiI);
        
        Curso fisicaII = new Curso("FS-241","Fisica II", "R",fisicaI, "impar", "200", 4);
        _mallaSistemas.add(fisicaII);
        
        Curso macro = new Curso("EC-241","Macroeconomía", "R",micro, "impar", "200", 3);
        _mallaSistemas.add(macro);
        
        //-------------------*PAR*----------------------//
        Curso invesOpera = new Curso("IS-262","Investigación de Operaciones", "R",algeLin , "par", "200",4 );
        _mallaSistemas.add(invesOpera);
        
        Curso metNum = new Curso("IS-242","Métodos Númericos", "R",calIII, "par", "200", 3);
        _mallaSistemas.add(metNum);
        
        Curso estadiII = new Curso("ES-244","Estadistica II", "R",estadiI, "par", "200", 4);
        _mallaSistemas.add(estadiII);
        
        Curso orgMet = new Curso("IS-248","Organización de Métodos", "R",admi, "par", "200", 3);
        _mallaSistemas.add(orgMet);
        
        Curso teorGenSis = new Curso("IS-246","Teoria General de Sistemas", "R",null, "par", "200", 3);
        _mallaSistemas.add(teorGenSis);
        
        Curso sisElecElec = new Curso("IS-244","Sist. Eléctricos y Electrónicos", "R",fisicaII, "par", "200", 5);
        _mallaSistemas.add(sisElecElec);
        
        Curso arteMusTea = new Curso("AC-222","Arte Musical y Teatral", "Co",null, "par", "200", 2);
        _mallaSistemas.add(arteMusTea);
        
        //-----------------------------SERIE 300------------------------------//
        //-----------------------------*IMPAR*---------------------------------//
        Curso invesOperaII = new Curso("IS-347","Investigación de Operaciones II", "R",invesOpera , "impar", "300",4 );
        _mallaSistemas.add(invesOperaII);
        
        Curso contGenl = new Curso("CO-341","Contabilidad General", "R",null, "impar", "300", 3);
        _mallaSistemas.add(contGenl);
        
        Curso lider = new Curso("CS-341","Liderazgo", "R",null, "impar", "300", 2);
        _mallaSistemas.add(lider);
        
        Curso MetSisBlan = new Curso("IS-343","Metodologia de Sistemas Blandos", "R",teorGenSis, "impar", "300", 3);
        _mallaSistemas.add(MetSisBlan);
        
        Curso planSisInf = new Curso("IS-345","Modelamiento de Datos", "R",orgMet, "impar", "300", 4);
        _mallaSistemas.add(planSisInf);
        
        Curso sisArquiComp = new Curso("IS-341","Sist. Digitales y Arquitectura de Computadoras", "R",sisElecElec, "impar", "300", 4);
        _mallaSistemas.add(sisArquiComp);
        
        Curso realNaci = new Curso("CS-321","Realidad Nacional", "Co",null, "impar", "300", 2);
        _mallaSistemas.add(realNaci);
        
        //---------------------------*PAR*-----------------------------------//
        Curso teoriDecis = new Curso("IS-342","Teoria de Decisiones", "R",invesOperaII , "par", "300",3 );
        _mallaSistemas.add(teoriDecis);
        
        Curso sisCos = new Curso("CO-342","Contabilidad General", "R",contGenl, "par", "300", 3);
        _mallaSistemas.add(sisCos);
        
        Curso SisInfI = new Curso("IS-362","Sistemas de Información", "R",planSisInf, "par", "300", 4);
        _mallaSistemas.add(SisInfI);
        
        Curso modDat = new Curso("IS-348","Modelamiento de Datos", "R",planSisInf, "par", "300", 4);
        _mallaSistemas.add(modDat);
        
        Curso sisDin = new Curso("IS-345","Sistemas Dinámicos", "R",MetSisBlan, "par", "300", 3);
        _mallaSistemas.add(sisDin);
        
        Curso sisOper = new Curso("IS-344","Sistemas Operativos", "R",sisArquiComp , "par", "300", 4);
        _mallaSistemas.add(sisOper);
        
        
    }
    //malla curricular de ingenieria de sistemas

}
