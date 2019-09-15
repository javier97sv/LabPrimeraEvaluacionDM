package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeraevaluacion.R;

import java.util.List;

import Entidades.Estudiantes;

public class AdaptadorEstudiante extends RecyclerView.Adapter<AdaptadorEstudiante.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txvCorrelativo, txvNombre, txvCodigo, txvMateria, txvPromedio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txvCorrelativo = itemView.findViewById(R.id.txvCorrelativo);
            txvNombre = itemView.findViewById(R.id.txvNombre);
            txvCodigo = itemView.findViewById(R.id.txvCodigo);
            txvMateria = itemView.findViewById(R.id.txvMateria);
            txvPromedio = itemView.findViewById(R.id.txvPromedio);
        }
    }

    public List<Estudiantes> lstEstudiantes;

    public AdaptadorEstudiante(List<Estudiantes> lstEstudiantes){
        this.lstEstudiantes = lstEstudiantes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estudiante, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String i = Integer.toString(this.lstEstudiantes.get(position).GetId());
        holder.txvCorrelativo.setText(i);

        holder.txvNombre.setText(this.lstEstudiantes.get(position).GetNombre());
        holder.txvCodigo.setText(this.lstEstudiantes.get(position).GetCodigo());
        holder.txvMateria.setText(this.lstEstudiantes.get(position).GetMateria());

        String pro = Double.toString(this.lstEstudiantes.get(position).GetPromedio());
        holder.txvPromedio.setText(pro);
    }

    @Override
    public int getItemCount() {
        return this.lstEstudiantes.size();
    }

    /*
    //Declaracion de variables
    private List<Estudiantes> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;


    public List<Estudiantes> GetData(){
        return this.datasource;
    }

    public AdaptadorEstudiante(Context context, int IdPlantilla, List<Estudiantes> sources){
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public Object getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //Validamos que no exista un formato
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);

            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView txvCorrelativo = convertView.findViewById(R.id.txvCorrelativo);
            TextView txvNombre = convertView.findViewById(R.id.txvNombre);
            TextView txvCodigo = convertView.findViewById(R.id.txvCodigo);
            TextView txvMateria = convertView.findViewById(R.id.txvMateria);
            TextView txvPromedio = convertView.findViewById(R.id.txvPromedio);

            //Obtenemos el dato a mostrar
            String i = Integer.toString(this.datasource.get(position).GetId());
            txvCorrelativo.setText(i);

            txvNombre.setText(this.datasource.get(position).GetNombre());
            txvCodigo.setText(this.datasource.get(position).GetCodigo());
            txvMateria.setText(this.datasource.get(position).GetMateria());

            String pro = Double.toString(this.datasource.get(position).GetPromedio());
            txvPromedio.setText(pro);
        }
        return convertView;
    }*/
}
