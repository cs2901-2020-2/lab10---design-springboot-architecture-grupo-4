package utec.lab10.lab10grupo4;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

// @SpringBootTest
// class ServiceApplicationTests {
    
//     private MockMvc mvc;

//     @Mock
//     private UsuarioRepository usuarioRepository;

//     @InjectMocks
//     private UsuarioController usuarioController;

//     @BeforeEach
//     public void setup() {
//         JacksonTester.initFields(this, new ObjectMapper());
//         mvc = MockMvcBuilders.standaloneSetup(superHeroController)
//                 .setControllerAdvice(new SuperHeroExceptionHandler())
//                 .addFilters(new SuperHeroFilter())
//                 .build();
//     }

//     @Test
//     void contextLoads() {

//     }

//     @Test
//     void testCase0() {
//         MockHttpServletResponse response = mvc.perform(
//             get("/usuarios")
//                 .accept(MediaType.APPLICATION_JSON))
//             .andReturn().getResponse();

//         assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//         assertTaht(response.getContentAsString()).isEqualTo(
             
//      );
//     }

//     @Test()
//     void testCase1() {
        
//     }

// }
