package com.myproject.WarehouseManagementApp.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private String name;

    private String surname;

    private String dateOfBirth;

    private String mobileNumber;

    private ClientType type;
}
