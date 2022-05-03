package com.germanorangel.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFase(View view){
        String[] frases = {
                "Diante de uma situção estressante, aquele que ri ao invés de se zangar, é sempre o mais forte e inteligente.",
                "Um sábio disse:'Quem muito diz ser algo,no fundo não é. Pois quem é algo de verdade, não precisa ficar dizendo.' ",
                "É como diz aquele velho ditado:'Prego que se destaca é sempre martelado. Por este motivo você não deve ter medo de ser criticado.'",
                "Nunca se vingue, sente e espere, pois aqueles que te machucaram se destruirão por conta própria!",
                "Não culpe as pessoas por terem lhe decepcionado. Culpe a si mesmo por esperar muito delas. Ou seja, foque no que você pode mudar!",
                "Na dúvida sobre o que dizer, faça o uso do silêncio. Ele incomoda, irrita chateia, mas também não desperdiça sua energia e ainda preserva sua imagem.",
                "Pare de sofrer pelo seu passado, ele não retorna. Foque no que vem pela frente!",
                "Pare de se preocupar com críticas de quem nunca construiu nada!",
                "Pare de andar com pessoas que apenas sugam a sua energia. Você é quem paga o preço!",
                "Pare de colocar a culpa nos outros. Sua é a responsabilidade pelo seus atos e atitudes!",
                "Pare de se cobrar demais, mantenha seu foco em pequenos passos rumo ao seu crescimento!",
                "Pare de ter medo do julgamento alheio, eles não conhecem sua verdadeira história, por mais próximos que sejam.",
                "Pare de se preocuar em ser aceito por todos. Ninguém tem o dom de agradar a todos, agrade-se!",
                "Pare de reclamar de coisas que não dependem de você, e haja na mudança do que depende!",
                "Antes de atingir seus objetivos, você precisa parar de fazer certas coisas e iniciar outras. Pois a mudança que você quer não vai acontecer do dia para a noite.",
                "Não existe Crescimento sem sacrifícios!",
                "Não tenha medo de abandonar certas coisas para focar naquilo que realmente importa!",
                "A falta de atividades físicas é um dos 7 inimigos do cérebro.",
                "Uma rotina monótona é um grande inimigo do seu cérebro",
                "Uma alimentação ruim, transformará seu cérebro a longo prazo em um cérebro ruim.",
               "Sobrecarga mental não é acúmulo de aprendizado, mas fadiga cerebral. Descanse sempre um pouco!",
                "A falta de metas claras faz seu cérebro andar em círculos, dando a ele baixa produtividade e consequentemente não realizando quase nada!",
                "Dormir pouco ou não dormir, faz muito mal ao cérebro. Então relaxe e aproveite bem sua noite de sono. Seu cérebro estrá recarregado logo pela manhã!",
                "Pessoas mudam com mais facilidade ao aprenderem com seus erros!",
                "Pare de viver com pessoas tóxicas e relacione-se mais com quem eleva sua energia!",
                "Pare de procrastinar e faça o que precisa ser feito! ",
                "Pare de se vitimizar e assuma a responsabilidade pela sua própria vida!",
                "O SUCESSO é a soma de rotinas, hábitos e repetições feitas todos os dias na direção do seu objetivo. Mesmo que seja de forma lenta!",
                "Existem pessoas menos qualificadas que você, fazendo coisas que você quer fazer, porque elas SIMPLESMENTE DECIDIRAM AGIR!",
                "Cale-se no calor da emoção. Evite cometer o erro de se arrepender depois!",
                "Se não sabe de todos os fatos, de ambos os lados, guarde para si mesmo sua opinião. Evite entrar em algo que não é problema seu!",
        };
        int numero = new Random().nextInt(31);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

    public void compartilharDados(View view){
        Intent intent = new Intent (Intent.ACTION_SEND);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Escolha um app para compartilhar"));

    }
}