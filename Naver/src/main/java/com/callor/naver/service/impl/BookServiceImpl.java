package com.callor.naver.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.callor.naver.config.APIConfig;
import com.callor.naver.model.BookResponse;
import com.callor.naver.model.BookVO;
import com.callor.naver.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BookServiceImpl implements BookService {


	@Override
	public List<BookVO> findByWord(String word) {

		String CLIENT_ID = APIConfig.Client_ID;
		String CLIENT_SECRET = APIConfig.Client_Secret;

		String apiUrl = APIConfig.SEARCH_URL + word;

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Naver-Client-Id", CLIENT_ID);
		headers.set("X-Naver-Client-Secret", CLIENT_SECRET);

		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);

		String jsonResponse = response.getBody();
		ObjectMapper objectMapper = new ObjectMapper();
		BookResponse bookResponse = null;
		List<BookVO> bookList = new ArrayList<>();

		try {
			bookResponse = objectMapper.readValue(jsonResponse, BookResponse.class);

			if (bookResponse != null) {
				bookList = bookResponse.getItems();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bookList;
	}

}
