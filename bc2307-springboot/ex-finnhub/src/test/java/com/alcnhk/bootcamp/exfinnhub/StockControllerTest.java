package com.alcnhk.bootcamp.exfinnhub;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import com.alcnhk.bootcamp.exfinnhub.model.Profile2;
import com.alcnhk.bootcamp.exfinnhub.model.Quote;
import com.alcnhk.bootcamp.exfinnhub.service.StockService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest
public class StockControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private StockService stockService;

  @Test
  void testGetStock() {
    Profile2 profile = new Profile2("HK", "HKG", "HKEX", "2023-01-01", 999,
        null, null, 0, null, null, null, null);
    Mockito.when(stockService.findStockProfile(null)).thenReturn(profile);

  }
}
