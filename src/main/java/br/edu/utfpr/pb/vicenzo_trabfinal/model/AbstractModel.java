package br.edu.utfpr.pb.vicenzo_trabfinal.model;

import java.io.Serializable;

public interface AbstractModel <ID extends  Serializable> 
            extends Serializable{
    ID getId();
}
