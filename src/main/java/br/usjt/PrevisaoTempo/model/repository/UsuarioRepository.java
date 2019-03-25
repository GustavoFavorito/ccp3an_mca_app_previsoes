package br.usjt.PrevisaoTempo.model.repository;

import br.usjt.PrevisaoTempo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findOneByLoginAndSenha (String login, String senha);

}