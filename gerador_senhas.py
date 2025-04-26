import random
def  gerarSenha(tamanho = 8);
    caracteres = "abcdefghijklmnopkrstuvwxyz0123456789"
    senha = ""

    for i in range(tamanho):
        senha += random.choice(caracteres)
    
    return senha

if _name_ == "__main__":
    print("Gerador de senhas v1.0")
    print("-" * 20)
    tamanho = int(input("Digite o tamanho da senha desejada: "))
    senha = gerarSenha(tamanho)

    printf("Sua senha gerada é: {senha}")