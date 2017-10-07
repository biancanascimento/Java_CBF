package br.ucb.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.modelo.Campeonato;
import br.ucb.modelo.Time;

@WebServlet("/ctlJogo")
public class CtlJogo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("jogos.jsp");
		Campeonato campeonato = (Campeonato) this.getServletContext().getAttribute("campeonato");
		if (campeonato == null) {
			campeonato = new Campeonato();
			this.getServletContext().setAttribute("campeonato", campeonato);
		}
		Time time1 = campeonato.getTimes().get(Integer.parseInt(request.getParameter("time1")));
		Time time2 = campeonato.getTimes().get(Integer.parseInt(request.getParameter("time2")));
		int golsTime1 = Integer.parseInt(request.getParameter("gols1"));
		int golsTime2 = Integer.parseInt(request.getParameter("gols2"));
		campeonato.adicionarJogo(time1, time2, golsTime1, golsTime2);
		dispatcher.forward(request, response);
	}

}
