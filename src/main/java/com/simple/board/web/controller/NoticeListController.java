package com.simple.board.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simple.board.web.entity.Notice;
import com.simple.board.web.service.NoticeService;

@WebServlet("/notice/list")
public class NoticeListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//list?f=title&q=a
		final String field_ = request.getParameter("f");
		final String query_ = request.getParameter("q");
		final String page_ = request.getParameter("p");
		
		
		String field ="title";
		if(field_ != null && !field_.equals("")) field = field_;
		String query = "";
		if(query_ != null && !query_.equals("")) query = query_;
		int page =1;
		if(page_ != null && !page_.equals("")) page =Integer.parseInt(page_);
		
		final NoticeService service = new NoticeService();
		final List<Notice> list = service.getNoticeList(field, query, page);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/view/notice/list.jsp").forward(request, response);
	}
}
