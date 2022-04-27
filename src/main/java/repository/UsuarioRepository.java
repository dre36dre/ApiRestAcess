package repository;

import org.springframework.data.repository.CrudRepository;

import com.anderson.acess.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository <UsuarioModel,Integer> {

}
