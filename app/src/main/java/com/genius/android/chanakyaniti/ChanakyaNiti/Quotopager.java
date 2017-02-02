package com.genius.android.chanakyaniti.ChanakyaNiti;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.genius.android.chanakyaniti.R;

public class Quotopager extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotopager);


        List = new String[] {

                "Learn from the mistakes of others… you can’t live long enough to make them all yourselves"
                ,"A person should not be too honest. Straight trees are cut first and Honest people are screwed first.",
                "Even if a snake is not poisonous, itshould pretend to be venomous.",
                "There is some self-interest behind every friendship. There is no friendship without self-interests. This is a bitter truth.",
                "Once you start a working on something, don’t be afraid of failure and don’t abandon it. People who work sincerely are the happiest.",
                "The fragrance of flowers spreads only in the direction of the wind. But the goodness of a person spreads in all direction.",

                "God is not present in idols. Your feelings are your god. The soul is your temple.",
                "A man is great by deeds, not by birth" ,
                "Never make friends with peoplewho are above or below you in status. Such",
                "Treat your kid like a darling for the first five years. For the next five years, scold them. By the time they turn sixteen, treat them like a friend.Your grown up children are your best friends.friendships will never give you any happiness.",
                "Education is the best friend. An educated person is respected everywhere. Education beats the beauty and the youth. ~ Chankya",
                "A wise man should marry a virgin of a respectable family even if she is deformed. He should not marry one of a low-class family, through beauty. Marriage in a family of equal status is preferable.",
                "Women who keep fast without permission of her husband shorten the life of her husband. She goes to hell and is punished with great horrors of hell.",
                "A good wife is one who serves her husband in the morning like a mother does, loves him in the day like a sister does and pleases him like a prostitute in the night.",
                "Men have hunger, sleep, fear and carnal intercourse in common with the lower animals. It is only knowledge that a man has more than they. Those men who have not it may be regarded as beasts"
                ,"The man who is foolish at the termination of his life shall always remain a fool.",
                "One destitute of wealth is not destitute, he is indeed rich, but the man devoid of learning is destitute in every way.",
                "Treat your kid like a darling for the first five years. For the next five years, scold them. By the time they turn sixteen, treat them like a friend. Your grown up children are your best friends.",
                "Though men be endowed with beauty and youth, and be born in a noble family, yet without education, they are like a palas tree, which is void of any sweet smell.",
                "Test a servant while in the discharge of his duty, a relative in difficulty, a friend in adversity, and a wife in misfortune."
                ,"Avoid him who talks sweetly before you but tries to ruin you behind your back, for he is like a pitcher full of poison with milk on top.",
                "The man who is foolish at the termination of his life shall always remain a fool.",
                "One destitute of wealth is not destitute, he is indeed rich, but the man devoid of learning is destitute in every way.",
                "He who is overly attached to his family members experiences fearb and sorrow, for the root of all grief is attachment. Thus one should discard attachment to be happy.",
                "The serpent, the king, the tiger, the stinging wasp, the small child, the dog owned by other people, and the fool: these seven ought not to be awakened from sleep.",
                "Even if a snake is not poisonous, it should pretend to be venomous.",
                "Purity of speech, of the mind, of the senses, and of a compassionate heart are needed by one who desires to rise to the divine platform.",
                "As a single withered tree, if set aflame, causes a whole forest to burn, so does a rascal son destroy a whole family.",
                "Books are as useful to a stupid person as a mirror is useful to a blind person.",
                "The life of an uneducated man is as useless as the tail of a dog which neither covers its rear end, nor protects it from the bites of insects.",
                "As soon as the fear approaches near, attack and destroy it.",
                "As long as your body is healthy and under control and death is distant, try to save your soul; when death is immanent what can you do?",
                "There is poison in the fang of the serpent, in the mouth of the fly and in the sting of a scorpion; but the wicked man is saturated with it.\n",


                "A person should not be too honest. Straight trees are cut first and honest people are screwed first.",
                "The biggest guru-mantra is: Never share your secrets with anybody. If you can not keep secret with you, do not expect that others will keep it? It will destroy you.",
                "There is some self interest behind every friendship. There is no friendship without self-interests. This a bitter truth.",
                "God is not present in idols. Your feelings are your god. The soul is your temple.",
                "Education is the best friend. An Educated Person is Respected Everywhere. Education beats the Beauty and the Youth.",
                "It is better to die than to preserve this life by incurring disgrace. The loss of life causes but a moment’s grief, but disgrace brings grief every day of one’s life.",
                "A human being should strive for four things in life — dharma (duty), artha (money), kama (pleasure) and moksha (salvation). A person who hasn’t striven for even one of these things has wasted life.",
                "There is some self-interest behind every friendship. There is no friendship without self-interests. This is a bitter truth.\n" ,

                "Never make friends with people who are above or below you in status. Such friendships will never give you any happiness.\n" ,

                "God is not present in idols. Your feelings are your god. The soul is your temple.",
                "As a single withered tree, if set aflame, causes a whole forest to burn, so does a rascal son destroy a whole family.",
                "He who nurtures benevolence for all creatures within his heart overcomes all difficulties and will be the recipient of all types of riches at every step.",
                "The man who remains a fool even in advanced age is really a fool, just as the Indra-Varuna fruit does not become sweet no matter how ripe it might become.",
                "Drop the idea that attachment and love are one thing. They are enemies. It is attachment that destroys all love.",
                "Generosity, pleasing address, courage and propriety of conduct are not acquired, but are inbred qualities.",
                "Beauty is spoiled by an immoral nature;noble birth by bad conduct; learning, without being perfected; and wealth by not being properly utilised.",
                "Purity of speech, of the mind, of the senses, and a compassionate heart are needed by one who desires to rise to the divine platform.",
                "Our bodies are perishable,wealth is not at all permanent and death is always nearby.Therefore we must immediately engage in acts of merit.",
                "The power of a king lies in his mighty arms;that of a brahmana in his spiritual knowledge; and that of a woman in her beauty youth and sweet words.",
                "Time perfects all living beings as well as kills them; it alone is awake when all others are asleep. Time is insurmountable.",
                "A man attains greatness by his merits, not simply by occupying an exalted seat. Can we call a crow an eagle (garuda) simply because he sits on the top of a tall building.",
                "A man is born alone and dies alone;and he experiences the good and bad consequences of his karma alone;and he goes alone to hell or the Supreme abode.",
                "Purity of speech, of the mind, of the senses, and of a compassionate heart are needed by one who desires to rise to the divine platform",
                "There is some self-interest behind every friendship. There is no friendship without self-interests. This is a bitter truth.",
                "The earth is supported by the power of truth;it is the power of truth tht makes the sun shine andthe winds blow; indeed all things rest upon truth.",
                "The man who remains a fool even in advanced age is really a fool, just as the Indra-Varuna fruit does not become sweet no matter how ripe it might become.",
                "As a calf follows its mother among a thousand cows, so the (good or bad) deeds of a man follow him.",
                "He who forsakes his own community and joins another perishes as the king who embraces an unrighteous path.",
                "A learned man is honoured by the people.A learned man commands respect everywhere for his learning. Indeed,learning is honoured everywhere.",
                "Avoid him who talks sweetly before you but tries to ruin you behind your back, for he is like a pitcher of poison with milk on top.",
                "Never make friends with people who are above or below you in status. Such friendships will never give you any happiness.",
                "Once you start working on something, don’t be afraid of failure and don’t abandon it. People who work sincerely are the happiest.",
                "The biggest guru-mantra is: Never share your secrets with anybody. If you cannot keep a secret with you, do not expect that others will keep it? It will destroy you.",
                "The king shall lose no time when the opportunity waited for arrives.",
                "The fragrance of flowers spreads only in the direction of the wind but the goodness of a person spreads in all directions.",
                "There is no austerity equal to a balanced mind, and there is no happiness equal to contentment; there is no disease like covetousness, and no virtue like mercy.",
                "He who is overly attached to his family members experiences fear and sorrow, for the root of all grief is attachment. Thus one should discard attachment to be happy.",
                "Do not be very upright in your dealings for you would see by going to the forest that straight trees are cut down while crooked ones are left standing.",
                "The biggest guru-mantra is: never share your secrets with anybody. It will destroy you.",
                "All the creatures are pleased by loving words; and therefore we should address words that are pleasing to all, for there is no lack of sweet words.",
                "Time perfects men as well as destroys them.",
                "One intelligent son is better than 100 stupid ones. One moon is able to brighten the night, but thousands of stars are not.",
                "Acharya says that offering food and water is the biggest of all donations. Dwadashi (द्वादशी) is the holiest day. Gayatri mantra (गायत्री मंत्र) is greatest of all the mantras. And mother is above all the deities.",
                "Intelligent people educate their son well about the morality and different aspects of life that makes him a better person ahead.",
                "According to Acharya, some things suit the best in certain levels. For example, offering services to the king, business done by Vaishyas, and the role of a good lady in the house. Similarly, friendships suit the best in the same social level.",
                "Grains, water and peach with everybody, these three things are the true gems on earth. Diamond, emerald, jewelry etc. are just the pieces of stone. Calling them a gem is folly.",
                "Poverty, disease, sorrow, imprisonment and bad habits – all are the fruits of the karma. You get what you sow.",
                "When a creature is in his mother’s womb, then five things that comes to him are luck-driven: age, karma, money-property, lore and death. Any of these five things can’t be changed anyhow.",
                "Someone who insults the Vedas, Shastras, intelligent, virtuous and peaceful persons, is a fool. In terms of wider interests of the society, such a person is maleficent in all ways, so its better to get rid of them for good."
        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(Quotopager.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }
}