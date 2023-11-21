package com.hkjava.demo.demofinnhub;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.not;
import static org.mockito.ArgumentMatchers.isNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import com.hkjava.demo.demofinnhub.config.TestDatabaseConfig;
import com.hkjava.demo.demofinnhub.entity.Stock;
import com.hkjava.demo.demofinnhub.repository.StockRepository;

@DataJpaTest // inject Repository related Beans
@Import(TestDatabaseConfig.class)
@TestPropertySource(properties = {"spring.jpa.hibernate.ddl-auto=update"})
public class StockRepositoryTest {

  @Autowired
  private StockRepository stockRepository;

  @Autowired
  private TestEntityManager tEntityManager;

  @Test
  void testFindById() {
    Stock entity = new Stock();
    // entity.setId(15L);
    entity.setCountry("CN");
    entity.setCompanyName("Orange Company");
    entity.setMarketCap(98761234.23);
    tEntityManager.persist(entity); // JPA <-> cache memory <-> database harddisk
    tEntityManager.flush(); // Database commit; -> harddisk

    // I am testing the "select * from table where id = 15;"
    Stock stock = stockRepository.findById(1L).orElse(null);
    assertThat(stock, hasProperty("country", equalTo("CN")));
    assertThat(stock, hasProperty("companyName", equalTo("Orange Company")));

  }

  @Test 
  void TestFindById2(){
    Stock entity2 = new Stock();
    entity2.setCountry("HK");
    entity2.setCompanyName("ALCN");
    entity2.setMarketCap(8888888);
    tEntityManager.persist(entity2);
    tEntityManager.flush();

    Stock stock = stockRepository.findById(2L).orElse(null);
    assertThat(stock, hasProperty("country",equalTo("HK")));
    assertThat(stock, hasProperty("companyName", equalTo("ALCN")));
    }

    @Test
    void testFindAll(){
      Stock stock1 = new Stock();
      stock1.setCountry("UK");
      stock1.setCompanyName("UK Company");
      stock1.setMarketCap(98761234.23);
      
      Stock stock2 = new Stock();
      stock2.setCountry("JP");
      stock2.setCompanyName("JP Company");
      stock2.setMarketCap(98761234.23);



  }


}
