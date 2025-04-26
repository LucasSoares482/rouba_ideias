import random

def gerar_senha(tamanho=8):
    """Gera uma senha aleatória com o tamanho especificado."""
    caracteres = "abcdefghijklmnopqrstuvwxyz0123456789"
    senha = ""
    
    for i in range(tamanho):
        senha += random.choice(caracteres)
    
    return senha


if __name__ == "__main__":
    print("Gerador de Senhas v1.0")
    print("-" * 20)
    
    tamanho = int(input("Digite o tamanho da senha desejada: "))
    senha = gerar_senha(tamanho)
    
    print(f"Sua senha gerada é: {senha}")
