package com.github.kerner1000.terra.data;

import lombok.Data;

import java.util.List;

@Data
public class Transaction {

    String hash;

    List<Event> events;
}
