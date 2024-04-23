/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author 10724112106
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Aluno> listasimples = new ArrayList<>();
        int opcao = -1;
        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de aluno\n" + "1 - inserir (Create)\n" + "2 - Consultar(Retrive)\n" + "3 - Atualizar (Update)\n" + "4 - Apagar(Delete)\n" + "5 - Classificar(Sort)\n" + "6 - Listar tudo\n" + "9 - Sair"));
            switch (opcao) {
                case 1:
                    Aluno novo = new Aluno();
                    novo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno")));
                    novo.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                    novo.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o idade do aluno")));
                    novo.setCurso(JOptionPane.showInputDialog("Digite o curso do aluno"));
                    novo.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite o fase do aluno")));
                    listasimples.add(novo);
                    System.out.println("Aluno inserido");
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Listagem iniciada");
                    for(int i = 0; i<listasimples.size();i++){
                        System.out.println("i: "+i);
                        System.out.println("id: "+listasimples.get(i).getId());
                        System.out.println("Nome: "+listasimples.get(i).getNome());
                        System.out.println("Idade: "+listasimples.get(i).getIdade());
                        System.out.println("Curso: "+listasimples.get(i).getCurso());
                        System.out.println("Fase: "+listasimples.get(i).getFase());
                        
                    }
                    break;
                case 9:
                    System.out.println("Saindo do Sistema!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}
