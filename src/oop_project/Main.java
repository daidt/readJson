/**
 * Created by Thanh Dai on 5/5/17.
 */
package oop_project;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Gson gson = new Gson();
        /*FileInputStream input;
        input = new FileInputStream("package");*/
        JsonReader jsonReader = new JsonReader(new FileReader("hocphan.json"));
        /* Hocphan st = new Gson().fromJson(jsonReader, Hocphan.class);
        //Hocphan hp = new gson.fromJson(jsonReader, Hocphan.class);
        //String jsonInString = mapper.writeValueAsString(package);
        System.out.println(st.getMaHocPhan());
        System.out.println(st.getSoTinChi());
        // System.out.println(st);
        if (st.getMaHocPhan() == "IT1020") System.out.println(st.getSoTinChi());*/
        List<Hocphan> list = new Gson().fromJson(jsonReader, new TypeToken<List<Hocphan>>(){}.getType());
        /*for (int i = 0; i < list.size(); i++)
            list.get(i).display();*/
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getMaHocPhan().equals("IT1020")) list.get(i).display();
    }
}