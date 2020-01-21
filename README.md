# Introducción a sistemas complejos, java, mvn y git

Este proyecto tiene como objetivo, la implementación de una aplicación en java usando las herramientas git y maven, que recibe un conjunto de datos en un archivo de texto, y como salida nos mostrará la media y la desviación estandar de estos. Además, se implentará una versión propia de la clase LinkedList, la cual nos ayudará a almacenar los datos que suministraremos en la entrada del programa.

## Empezando

Para descargar este proyecto en algún directorio local, empezamos abriendo un ventana de consola y escribimos:

``` $ git clone https://github.com/migue1994/TallerMVNGIT.git ```



## Prerequisitos

Para empezar, debemos asegurarnos que tenemos las herramientas necesarias para poder ejecutar el proyecto (En caso de que no posea alguna de estas herrmientas, puede dar click sobre los nombres que están a continuación y lo redirecionará a un tutorial de instalacion), estas herramientas son:

- [Java JDK](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-A740535E-9F97-448C-A141-B95BF1688E6F)
- [Apache Maven](https://howtodoinjava.com/maven/how-to-install-maven-on-windows/)
- [Git](https://www.linode.com/docs/development/version-control/how-to-install-git-on-linux-mac-and-windows/)

## Ejecutar el proyecto.

Una vez que hayamos descargado nuestro proyecto, abrimos una cmd y accedemos al directorio donde esta el proyecto, una vez allí, ejecutamos el siguiente comando:

``` $ mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.ASE.app.App" ```

Una vez se haya ejecutado el comando, se compilará el proyecto y nos dirá que necesita un path, en el cual se encuentran los datos


