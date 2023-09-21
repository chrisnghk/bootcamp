package com.alcnhk.bootcamp.demoresttemplate.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.alcnhk.bootcamp.demoresttemplate.exception.JPHException;
import com.alcnhk.bootcamp.demoresttemplate.infra.BusinessException;
import com.alcnhk.bootcamp.demoresttemplate.infra.Code;
import com.alcnhk.bootcamp.demoresttemplate.infra.Protocol;
import com.alcnhk.bootcamp.demoresttemplate.model.User;
import com.alcnhk.bootcamp.demoresttemplate.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.jsonplaceholder.domain}")
  private String jphDomain; // jsonplaceholder.typicode.com

  @Value(value = "${api.jsonplaceholder.users}")
  private String userEndpoint; //

  @Override
  public List<User> findUsers() throws BusinessException {
    String url = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host(jphDomain)//
        .path(userEndpoint)//
        .toUriString();
        
    System.out.println("url" + url);
    // Invoke API + Jaskson Deserialization ( json -> object)

    try {
    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
    }catch (RestClientException e){
      throw new JPHException(Code.JPH_NOTFOUND);
    }

  }

  @Override
  public User findUser(int id){
        String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name()) //
        .host(jphDomain)//
        .path(userEndpoint)//
        .toUriString();
    System.out.println("url" + url);
    // api invoke 
    User[] users = restTemplate.getForObject(url, User[].class);
    //return users[id-1];//
    return Arrays.asList(users).stream().filter(u -> u.getId() == id)
    .findAny().orElse(null);
    
  }

  @Override
  public String print() {
    String url = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host(jphDomain)//
        .path(userEndpoint)//
        .toUriString();
    System.out.println("url" + url);
    return "url" + url;
  }

}
