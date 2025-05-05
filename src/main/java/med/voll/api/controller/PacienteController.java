package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PacienteController {

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dadosPaciente){

    }

}
