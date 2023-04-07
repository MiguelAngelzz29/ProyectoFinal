package es.miguel.polideportivo.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDate;
import java.util.List;

import es.miguel.polideportivo.R;

public class CalendarioAdapter extends RecyclerView.Adapter<CalendarioAdapter.ViewHolder> {

    private List<String> listaDias;

    public CalendarioAdapter(List<String> listaDias) {
        this.listaDias = listaDias;
    }

    @NonNull
    @Override
    public CalendarioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_dias,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CalendarioAdapter.ViewHolder holder, int position) {
        holder.diaLetra.setText(listaDias.get(position));
        holder.diaNum.setText(listaDias.get(position));
        holder.mes.setText(listaDias.get(position));

    }

    @Override
    public int getItemCount() {
        return listaDias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView diaLetra,diaNum,mes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            diaLetra = itemView.findViewById(R.id.tv_diaLetra);
            diaNum = itemView.findViewById(R.id.tv_diaNumero);
            mes = itemView.findViewById(R.id.tv_mes);
        }
    }
}
