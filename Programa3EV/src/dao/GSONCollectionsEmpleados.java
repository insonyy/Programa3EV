package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import com.google.gson.reflect.TypeToken;
import domain.Empleado;

public class GSONCollectionsEmpleados {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public GSONCollectionsEmpleados() {
        Collection<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println(nums);
        String json = gson.toJson(nums);
        System.out.println(json);
        Collection<Empleado> empleados = Arrays.asList(new Empleado("nombre1", "apellido1", "dni1", "cargo1"),
                (new Empleado("nombre2", "apellido2", "dni2", "cargo2")),
                (new Empleado("nombre3", "apellido3", "dni3", "cargo3")),
                (new Empleado("nombre4", "apellido4", "dni4", "cargo4")),
                (new Empleado("nombre5", "apellido5", "dni5", "cargo5")),
                (new Empleado("nombre6", "apellido6", "dni6", "cargo6")),
                (new Empleado("nombre7", "apellido7", "dni7", "cargo7")),
                (new Empleado("nombre8", "apellido8", "dni8", "cargo8")),
                (new Empleado("nombre9", "apellido9", "dni9", "cargo9")),
                (new Empleado("nombre10", "apellido10", "dni10", "cargo10")),
                (new Empleado("nombre11", "apellido11", "dn11", "cargo11")));
        String empJson = gson.toJson(empleados);
        System.out.println(empJson);

        Type collectionType = new TypeToken<Collection<Integer>>() {
        }.getType();
        Collection<Integer> nums2 = gson.fromJson(json, collectionType);
        System.out.println(nums2);

        String empleadosJson = "[\r\n" +
                "  {\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "  {\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "  {\r\n" +
                "   \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "  {\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "  {\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  }\r\n" +
                " {\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "{\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "{\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "{\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "{\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "{\r\n" +
                "    \"nombre\": \"apellido\",\r\n" +
                "    \"dni\": \"cargo\"\r\n" +
                "  },\r\n" +
                "]";

        Type type = new TypeToken < Collection < Empleado>>(){}.getType();
        Collection <Empleado> colleccionEmple = gson.fromJson(empleadosJson, type);
        System.out.println(colleccionEmple);

    }
}
