package br.com.jaime.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="Bean")
public class Bean {
	public String getHorario() {
	    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	    return "Hora atualizada: " + sdf.format(new Date());
	  }
}