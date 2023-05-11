package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import config.Configuration;
import domain.Empleado;
import lombok.extern.log4j.Log4j2;

@Log4j2

public class DatabaseEmpleados {

    public List<Empleado> loadEmpleados() {
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<Empleado>>(){}.getType();

        List<Empleado> empleados = null;
        try{
            empleados = gson.fromJson(new FileReader(new Configuration().loadPathProperties()), userListType);

        }catch (FileNotFoundException e){
            log.error(e.getMessage(), e);
        }
        return empleados;
    }

    public boolean saveEmpleados(List<Empleado> empleados){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fw = new FileWriter(new Configuration().loadPathProperties())){
            gson.toJson(empleados,fw);
        }catch (IOException e){
            log.error(e.getMessage(),e);
            return false;
        }
        return true;
    }
}
