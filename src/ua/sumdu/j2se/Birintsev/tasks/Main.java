package ua.sumdu.j2se.Birintsev.tasks;

import java.io.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ua.sumdu.j2se.Birintsev.tasks.TaskIO;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, IOException {

        /*Task task1 = new Task("some",1);
        Task task2 = new Task("some",2);
        Task task3 = new Task("some",3);

        LinkedTaskList linked = new LinkedTaskList();
        ArrayTaskList array = new ArrayTaskList();

        linked.add(task1);
        linked.add(task2);
        linked.add(task3);

        array.add(task1);
        array.add(task2);
        array.add(task3);


        System.out.println(task1);

        System.out.println(linked);

        System.out.println(array);


        LinkedTaskList linkedClone = linked.clone();
        ArrayTaskList arrayClone = array.clone();

        linkedClone.getTask(0).setTitle("linkCHANGED");
        arrayClone.getTask(0).setTitle("arrCHANGED");

        System.out.println(linked.getTask(0));
        System.out.println(linkedClone.getTask(0));
        System.out.println(array);
        System.out.println(arrayClone);
        System.out.println(linked);
        System.out.println(linkedClone);
        //System.out.println(array.getTask(0));
        //System.out.println(arrayClone.getTask(0));
    */
        //System.out.println(new Date() instanceof Serializable);
        /*String str = "alalal\"asda";
        System.out.println(str.replace("\"","\"\""));
        System.out.println(str);*/
        /*Date date = new Date();
        System.out.println(date);*/
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss.S]");
        System.out.println("date: " + dateFormat.format( new Date() ) );*/
        /*int interval = 86400; // in seconds
        int days = interval / 86400;
        int hours = (interval - days * 86400) / 3600;
        int minutes = (interval - days * 86400 - hours * 3600) / 60;
        int seconds = interval - days * 86400 - hours * 3600 - minutes * 60;
        System.out.println(" д:"+days+" ч:"+hours+" м:"+minutes+" с:"+seconds);*/
        //String str = "012 45 78 ";
        //StringBuilder intervalFormat = new StringBuilder("012 45 78 ");
        /*System.out.println(str.length());
        System.out.println(str.charAt(9));*/
        //System.out.println(str.substring(0,str.length()-1));
        //intervalFormat.substring(0,intervalFormat.length()-1);
        /*Task task1 = new Task("S\"o\"me task1",new Date());
        task1.setActive(false);
        Task task2 = new Task("S\"ome ta\"sk2",new Date(112312312312313l),new Date(112312312333412313l),3601);
        task2.setActive(false);
        TaskList list = new ArrayTaskList();
        list.add(task1);
        list.add(task2);
        System.out.println(list);*/
        /*char c = '\n';
        System.out.println((char)10);*/
        /*String str = "\n\"Very \"\"Good\"\" title\" at [2013-05-10 20:31:20.001] inactive;";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        Pattern patternNonRepeated = Pattern.compile("^\\n?\"(.*)\" at \\[(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})](.*)[.;]$");
        Pattern patternRepeated = Pattern.compile("^\\n?\"(.*)\" from \\[(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})] to \\[(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})] every \\[(.*)](.*)[.;]$");
        Task task;
        Matcher matcher = patternNonRepeated.matcher(str);
        if (matcher.find()){
            //System.out.println(matcher.group(2));
            try {
                //System.out.println(matcher.group(1));
                String details = matcher.group(1).replace("\"\"", "\"");
                Date time = dateFormat.parse(matcher.group(2));
                boolean isActive = matcher.group(3).length() == 0;
                task = new Task(details,time);
                task.setActive(isActive);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }else{
            matcher = patternRepeated.matcher(str);
            try {
                String details = matcher.group(1).replace("\"\"", "\"");
                Date start = dateFormat.parse(matcher.group(2));
                Date end = dateFormat.parse(matcher.group(3));
                int interval = parseInterval(matcher.group(4));
                boolean isActive = matcher.group(5).length() == 0;
                task = new Task(details,start,end,interval);
                task.setActive(isActive);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
    */
        /*File file = new File();
        Writer writer = new Buffer(file);
        String stringTasks = "\"A\" at [2018-12-04 10:59:22.503] inactive;\n\"B\" from [2018-12-04 10:59:22.503] to [2018-12-05 10:59:22.503] every [1 hour] inactive;\n\"C\" at [2018-12-04 10:59:22.503];\n\"B\" from [2018-12-04 10:59:22.503] to [2018-12-05 10:59:22.503] every [1 hour].";
        TaskIO.readText();*/

        /*Task task1 = new Task("some1",new Date(11111111));
        Task task2 = new Task("some1",new Date(2222222), new Date(333333333),10000);
        Task task3 = new Task("some1",new Date(1234567), new Date(123456789),33000);
        task3.setActive(true);
        TaskList tasks = new LinkedTaskList();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        File file = new File("C:\\Users\\Leader\\Desktop\\Java projects\\Task manager (Idea project + java.course.dev)\\temp.txt");
        Reader reader = new FileReader(file);
        Writer writer = new FileWriter(file);
        TaskIO.write(tasks,writer);
        TaskList tasks1 = new LinkedTaskList();
        try {
            TaskIO.read(tasks1,reader);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(tasks1);*/


    }
    /*private static int parseInterval(String string){
        int seconds = 0;
        Pattern pattern = Pattern.compile("(\\d) day");
        Matcher matcher = pattern.matcher(string);
        if(matcher.find()){
            seconds += Integer.parseInt(matcher.group(1)) * 86400;
        }
        pattern = Pattern.compile("(\\d) hour");
        matcher = pattern.matcher(string);
        if(matcher.find()){
            seconds += Integer.parseInt(matcher.group(1)) * 3600;
        }
        pattern = Pattern.compile("(\\d) minute");
        matcher = pattern.matcher(string);
        if(matcher.find()){
            seconds += Integer.parseInt(matcher.group(1)) * 60;
        }
        pattern = Pattern.compile("(\\d) second");
        matcher = pattern.matcher(string);
        if(matcher.find()){
            seconds += Integer.parseInt(matcher.group(1));
        }
        return seconds;
    }*/
}