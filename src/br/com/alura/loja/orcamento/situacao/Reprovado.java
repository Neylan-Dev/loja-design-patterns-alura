package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.SituacaoOrcamento;

public class Reprovado extends SituacaoOrcamento {
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
