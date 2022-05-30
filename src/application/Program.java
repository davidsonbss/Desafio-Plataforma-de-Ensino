package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Lesson> listLesson = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int quantidadeAulas = sc.nextInt();
		System.out.println();

		for (int i = 0; i < quantidadeAulas; i++) {
			System.out.println("Dados da " + (i + 1) + "a aula:");
			System.out.print("Contúdo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String title = sc.nextLine();

			if (ch == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.next();
				System.out.print("Duração em segundos: ");
				Integer seconds = sc.nextInt();

				listLesson.add(new Video(title, url, seconds));

			} else if (ch == 't') {
				System.out.print("Descrição: ");
				sc.hasNextLine();
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				Integer questions = sc.nextInt();

				listLesson.add(new Task(title, description, questions));
			}
			System.out.println();
		}

		Integer totalDuration = 0;

		for (Lesson x : listLesson) {
			totalDuration += x.duration();
		}

		System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");

		sc.close();

	}

}
