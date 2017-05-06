/**
 * Created by Thanh Dai on 5/5/17.
 */
package oop_project;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void WriterJsonObject(List<Hocphan> list) throws IOException {
        JsonWriter writer = new JsonWriter(new FileWriter("E:\\oop_project1\\hocphan.json"));
        writer.setIndent("    ");
        writerArray(writer,list);
        writer.close();
        }
    public static void writerArray(JsonWriter writer, List<Hocphan> list) throws IOException {
        writer.beginArray();
        for (Hocphan hp : list) writerObject(writer,hp);
        writer.endArray();
        }

    public static void writerObject(JsonWriter writer, Hocphan hp) throws  IOException {
        writer.beginObject();
        writer.name("MaHocPhan").value(hp.getMaHocPhan());
        writer.name("TenHocPhan").value(hp.getTenHocPhan());
        writer.name("ThoiLuong").value(hp.getThoiLuong());
        writer.name("SoTinChi").value(hp.getSoTinChi());
        writer.name("TinChiHocPhi").value(hp.getTinChiHocPhi());
        writer.name("TrongSo").value(hp.getTrongSo());
        writer.endObject();
        }

    public static void main(String[] args) throws IOException {

        JsonReader jsonReader = new JsonReader(new FileReader("E:\\oop_project1\\hocphan.json"));
        List<Hocphan> list = new Gson().fromJson(jsonReader, new TypeToken<List<Hocphan>>(){}.getType());
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getMaHocPhan().equals("IT1555")) list.get(i).display();
        Hocphan hp = new Hocphan();
        hp.setMaHocPhan("IT1555");
        hp.setTenHocPhan("Thanh Dai");
        hp.setThoiLuong("5(3-3-1-6)");
        hp.setSoTinChi(4);
        hp.setTinChiHocPhi(2.0);
        hp.setTrongSo(3.0);
        list.add(hp);
        System.out.println(hp);
        WriterJsonObject(list);
    }
}