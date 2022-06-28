# Fragments

#### Exercício Fragments:
- Crie uma aplicação que possui uma activity composta por dois fragments. Do lado esquerdo existe um fragment composto pelos botões Preto, Azul, Verde, Vermelho e Amarelo. Do lado direito existe um fragment vazio. Toda vez que um botão é pressionado, o fragment da direita muda para a cor associada ao botão
clicado. Ao criar a aplicação, leve em consideração a boa prática de desenvolvimento Android que diz que dois ou mais fragments não devem trocar informações diretamente. Apenas a activity tem esse papel. Neste caso específico, isto significa dizer que o fragment que contém os botões deve avisar a activity que houve um clique. E a activity, por sua vez, será responsável por interagir com o fragment da direita para mudar a sua cor.
