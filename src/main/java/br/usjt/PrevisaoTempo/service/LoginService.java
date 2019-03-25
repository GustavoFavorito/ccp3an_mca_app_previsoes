package br.usjt.PrevisaoTempo.service;

import br.usjt.PrevisaoTempo.model.Usuario;
import br.usjt.PrevisaoTempo.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UsuarioRepository usuarioRepo;
    public boolean logar (Usuario usuario) {
        return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
                usuario.getSenha()) != null;
    }
}