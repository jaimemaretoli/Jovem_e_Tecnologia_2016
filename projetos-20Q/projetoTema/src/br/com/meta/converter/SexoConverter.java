package br.com.meta.converter;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.com.meta.modelo.Sexo;

public class SexoConverter implements Converter {
    
    @Override
   public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
       try {
           return this.pesquisar(Integer.parseInt(value));
       } catch (Exception ex) {
           Logger.getLogger(SexoConverter.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return null;
   }
    
    public Sexo pesquisar(Integer id){
        if(id != null && id == 1){
            Sexo sexo = new Sexo();
            sexo.setId(1);
            sexo.setGenero("Masculino");
            sexo.setCodigo("m");
            return sexo;
        } else if (id != null && id == 2) {
            Sexo sexo = new Sexo();
            sexo.setId(2);
            sexo.setGenero("Feminino");
            sexo.setCodigo("f");
            return sexo;
        }
        
        return null;
    }

   @Override
   public String getAsString(FacesContext fc, UIComponent uic, Object o) {
       
    if(o != null && ((Sexo) o).getId() != null){
        return ((Sexo) o).getId().toString();
    }
    
    return "";
   }
}