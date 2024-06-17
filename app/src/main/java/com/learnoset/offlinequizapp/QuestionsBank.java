package com.learnoset.offlinequizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("¿Cuál es el tamaño de la variable int?", "16 bit", "8 bit", "32 bit", "64 bit", "32 bit");
        final QuestionsList question2 = new QuestionsList("¿Cuál es el valor predeterminado de la variable booleana?", "true", "false", "null", "not defined", "false");
        final QuestionsList question3 = new QuestionsList("¿Cuál de los siguientes es el valor predeterminado de una variable de instancia?", "Depende del tipo de variable", "nulo", "0", "no asignado", "Depende del tipo de variable");
        final QuestionsList question4 = new QuestionsList("¿Cuál es una palabra reservada en el lenguaje de programación Java?", "method", "native", "reference", "array", "native");
        final QuestionsList question5 = new QuestionsList("¿Cuáles de las siguientes NO son palabras clave o palabras reservadas en Java?", "if", "then", "goto", "while", "then");
        final QuestionsList question6 = new QuestionsList("¿Cuáles son las declaraciones válidas dentro de una definición de interfaz?", "public double methoda();", "public final double methoda();", "static void methoda(double d1);", "protected void methoda(double d1);", "public double methoda();");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("¿Qué significa PHP?", "Professional Home Page", "Hypertext Preprocessor", "Pretext Hypertext Processor", "Preprocessor Home Page", "Hypertext Preprocessor");
        final QuestionsList question2 = new QuestionsList("¿Quién es el padre de PHP?", "Rasmus Lerdorf", "Willam Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf");
        final QuestionsList question3 = new QuestionsList("Los archivos PHP tienen una extensión de archivo predeterminada de.", ".html", ".php", ".xml", ".json", ".php");
        final QuestionsList question4 = new QuestionsList("Un script PHP debe comenzar con ___ y terminar con ___:", "< php >", "<php />", "< ? ? >", "< ?php ? >", "< ?php ? >");
        final QuestionsList question5 = new QuestionsList("¿Qué versión de PHP introdujo la excepción Try/catch?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "PHP 5");
        final QuestionsList question6 = new QuestionsList("Si $a = 12 ¿qué se devolverá cuando se ejecute ($a == 12)? 5: 1?", "12", "1", "5", "error", "5");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("¿Qué significa HTML?", "Hyper Text Markup Language", "High Text Markup Language", "Hyper Tabular Markup Language", "None of these", "Hyper Text Markup Language");
        final QuestionsList question2 = new QuestionsList("¿Cuál de las siguientes etiquetas se utiliza para marcar el comienzo de un párrafo?", "<TD>", "<br>", "<P>", "<TR>", "<P>");
        final QuestionsList question3 = new QuestionsList("¿De qué etiqueta comienza la lista descriptiva?", "<LL>", "<DD>", "<DL>", "<DS>", "<DL>");
        final QuestionsList question4 = new QuestionsList("La etiqueta HTML correcta para el encabezado más grande es", "<head>", "<large>", "<h6>", "<heading>", "<h1>");
        final QuestionsList question5 = new QuestionsList("El atributo de la etiqueta <form>", "Method", "Action", "Both (a)&(b)", "None of these", "Both (a)&(b)");
        final QuestionsList question6 = new QuestionsList("Las etiquetas de marcado le indican al navegador web", "Cómo organizar la página", "Cómo visualizar la página", "Cómo mostrar un cuadro de mensaje en la página", "Ninguno de esos", "Cómo visualizar la página");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Seleccione un componente que NO sea parte de la arquitectura de Android.", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel");
        final QuestionsList question2 = new QuestionsList("Un ___________ hace que un conjunto específico de datos de la aplicación esté disponible para otras aplicaciones.", "Content provider", "Broadcast receivers", "Intent", "Ninguno de los anteriores", "Content provider");
        final QuestionsList question3 = new QuestionsList("¿Cuáles de estos NO son parte de las bibliotecas nativas de Android?", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik");
        final QuestionsList question4 = new QuestionsList("Durante el ciclo de vida de una actividad, ¿cuál es el primer método de devolución de llamada invocado por el sistema?", "onStop()", "onStart()", "onCreate()", "onRestore()", "onCreate()");
        final QuestionsList question5 = new QuestionsList("¿Qué método de actividad utiliza para recuperar una referencia a una vista de Android mediante el atributo id de un recurso XML?", "findViewByReference(int id);", "findViewById(int id);", "findViewById(String id);", "retrieveResourceById(int id);", "findViewById(int id);");
        final QuestionsList question6 = new QuestionsList("Las solicitudes de la clase Proveedor de contenido se manejan mediante el método", "onCreate", "onSelect", "ContentResolver", "onClick", "ContentResolver");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
