package ua.com.shop.course_391_391_2023.service;


import org.springframework.stereotype.Service;
import ua.com.shop.course_391_391_2023.entity.Clients;
import ua.com.shop.course_391_391_2023.entity.Users;
import ua.com.shop.course_391_391_2023.repository.ClientRepository;
import ua.com.shop.course_391_391_2023.repository.OrderRepository;
import ua.com.shop.course_391_391_2023.repository.UsersRepository;

@Service
public class UsersService {

    private final ClientRepository clientRepository;
    private final UsersRepository usersRepository;

    protected final OrderRepository orderRepository;


    public UsersService(ClientRepository clientRepository, UsersRepository usersRepository, OrderRepository orderRepository) {
        this.clientRepository = clientRepository;
        this.usersRepository = usersRepository;
        this.orderRepository = orderRepository;
    }


    public boolean getLogicByUser(String username, String password){

        boolean logic = false;
        if(!usersRepository.findAllByUsernameAndPassword(username, password).isEmpty())
            logic = true;

        return logic;
        //(!usersRepository.findAllByUsername(username).isEmpty()) ? true : false;
    }

    public Users getUserByUsernameAndPass(String username, String password){
        return usersRepository.findByUsernameAndPassword(username, password);
    }


    public Clients getClientByUser(Users users){
        return clientRepository.findByUser(users);
    }

}
