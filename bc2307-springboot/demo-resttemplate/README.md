###
###
- enum ( Code.java)
- BusinessException, JPHException
- Mapper Logic ( UserMapper, used to convert from User -> UserDTO)
- @WebMvcTest -> Autowird MockMvc -> @MockBean
- @SpringBootTest( Complete SB enviroment, fulll context)
- ResponseEntity ( because sometimes we have to return non-200 status)
- GlobalExceptionHandler(ControllerAdvice)