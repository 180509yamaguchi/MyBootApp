package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIOException;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalcTest {
	static Calc calc = null;
	@BeforeAll
	static void テスト前処理() {
	    calc = new Calc();
	}
	@Test
	void addテスト_正常() {
	    assertEquals(calc.add(1, 3), 4);
	    assertThat(calc.add(1, 3)).isEqualTo(4);
	}
	@Test
	void subテスト_正常(){
		assertEquals(calc.sub(3, 1), 2);
	    assertThat(calc.sub(3, 1)).isEqualTo(2);
	}

	@Test
	void divテスト_正常(){
		assertEquals(calc.div(2, 1), 2);
	    assertThat(calc.div(2, 1)).isEqualTo(2);
	
	}
	@Test
	void divテスト_異常(){
	    assertThatIOException() .isThrownBy(() -> {
	    	calc.div(4, 0);
	    	// when
	    	Throwable thrown = catchThrowable(() -> {
	    	  

	    	});
	    	// then
	    	assertThat(thrown)
	    	.isInstanceOf(ArithmeticException.class)
	    	.hasMessageContaining("/ by zero");

	    });

	}
	@Test
	void mulテスト_正常(){
		assertEquals(calc.mul(3, 1), 3);
	    assertThat(calc.mul(3, 1)).isEqualTo(3);
	}
	@AfterAll
	static void テスト後処理() {
	    calc = null;
	}

}
