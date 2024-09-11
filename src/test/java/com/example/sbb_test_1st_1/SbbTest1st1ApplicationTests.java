package com.example.sbb_test_1st_1;

import com.example.sbb_test_1st_1.article.Article;
import com.example.sbb_test_1st_1.article.ArticleRepositoy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbTest1st1ApplicationTests {

	@Autowired
	private ArticleRepositoy articleRepositoy;

	@Test
	public void originalDate() {
		Article a1 = new Article();
		LocalDateTime cD1 = LocalDateTime.of(2023, 12, 29, 18, 33);
		a1.setTitle("test07");
		a1.setContent("test07");
		a1.setCreatedDate(cD1);
		articleRepositoy.save(a1);

		Article a2 = new Article();
		LocalDateTime cD2 = LocalDateTime.of(2023,12,29,18,44);
		a2.setTitle("t7");
		a2.setContent("t7");
		a2.setCreatedDate(cD2);
		articleRepositoy.save(a2);

		Article a3 = new Article();
		LocalDateTime cD3 = LocalDateTime.of(2024,01,02,15,6);
		a3.setTitle("test2024");
		a3.setContent("test2024");
		a3.setCreatedDate(cD3);
		articleRepositoy.save(a3);

		Article a4 = new Article();
		LocalDateTime cD4 = LocalDateTime.of(2024,01,02,16,9);
		a4.setTitle("7");
		a4.setContent("7");
		a4.setCreatedDate(cD4);
		articleRepositoy.save(a4);

		Article a5 = new Article();
		LocalDateTime cD5 = LocalDateTime.of(2024,01,02,16,40);
		a5.setTitle("777777");
		a5.setContent("777777");
		a5.setCreatedDate(cD5);
		articleRepositoy.save(a5);

		Article a6 = new Article();
		LocalDateTime cD6 = LocalDateTime.of(2024,01,02,16,41);
		a6.setTitle("9999");
		a6.setContent("9999");
		a6.setCreatedDate(cD6);
		articleRepositoy.save(a6);

		Article a7 = new Article();
		LocalDateTime cD7 = LocalDateTime.of(2024,01,02,16,43);
		a7.setTitle("777");
		a7.setContent("777");
		a7.setCreatedDate(cD7);
		articleRepositoy.save(a7);
	}
}
