#!/usr/bin/env bash
# start Vault server using:
./vault server -config vault.conf

# init vault
./vault init -key-shares=5 -key-threshold=2

# unseal vault (twice)
./vault operator unseal

./vault operator unseal

# write data: refer this for more examples: https://github.com/mp911de/spring-cloud-vault-config-samples/blob/master/src/test/bash/setup_examples.sh
./vault write secret/vault-proto mykey=myvalue hello.world='Hello, World'

./vault write secret/vault-proto/development mykey=development hello.world='Hello Developer' dog.name='Vault Puppy' dog.age=3 cat.name='Vault Meow' cat.age=4