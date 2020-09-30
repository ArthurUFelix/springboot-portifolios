package br.com.gerenciamentoprojetos.repository;

import br.com.gerenciamentoprojetos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
