//package org.example.hr.controller;
//
//import org.example.hr.infra.InMemoryEmployeeRepository;
//import org.example.hr.service.EmployeeCommandService;
//import org.example.hr.service.EmployeeQueryService;
//import org.example.hr.service.dto.EmployeeCreateRequest;
//import org.example.hr.service.dto.EmployeeCreatedResponse;
//import org.example.hr.ui.console.ConsoleInputUI;
//import org.example.hr.ui.console.ConsoleOutputUI;
//
//public class HRManagementSystemMain {
//    private static final InMemoryEmployeeRepository repository = new InMemoryEmployeeRepository();
//    private static final EmployeeCommandService commandService = new EmployeeCommandService(repository);
//    private static final EmployeeQueryService queryService = new EmployeeQueryService(repository);
//
//    public static void main(String[] args) {
//        String name = ConsoleInputUI.enterName();
//        String no = ConsoleInputUI.enterNo();
//        String ssn = ConsoleInputUI.socialSecurityNumber();
//
//        commandService.add(new EmployeeCreateRequest(no, name, ssn));
//        EmployeeCreatedResponse response = queryService.findByNo(no);
//
//        ConsoleOutputUI.printResult(response);
//    }
//}